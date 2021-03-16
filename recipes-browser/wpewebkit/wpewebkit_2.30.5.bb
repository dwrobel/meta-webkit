# dw: Make Error at CMakeLists.txt:70 (message):
#     GCC 7.3 or newer is required to build WebKit.  Use a newer GCC version or Clang.
TOOLCHAIN = "clang"
TOOLCHAIN_class-native = "clang"

require wpewebkit.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI = "\
    https://wpewebkit.org/releases/${BPN}-${PV}.tar.xz \
    file://216455_builds_with_ENABLE_SERVICE_WORKER_OFF.patch \
"

SRC_URI[sha256sum] = "4b577f4f07c34bb5d453d62b7a41d9e937bd3a2827a92dcd6f47c35f27c8359a"

DEPENDS += " libwpe"
RCONFLICTS_${PN} = "libwpe (< 1.4) wpebackend-fdo (< 1.6)"

PACKAGECONFIG = "fetchapi indexeddb remote-inspector openjpeg unified-builds \
                 ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '' ,d)}"
