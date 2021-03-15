require cog.inc

SRC_URI = "https://github.com/Igalia/cog/releases/download/v${PV}/cog-${PV}.tar.xz \
           file://0001-platform-add-a-common-EGL-proc-address-loader-with-d.patch \
           file://0002-egl-proc-address.h-add-a-license-header.patch \
           "

SRC_URI[sha256sum] = "181b1f4963cdf264b8068460a64d14c92a627f7138ebecc0f36fce085f4e92dd"

RDEPENDS_${PN} += "wpewebkit (>= 2.28)"
