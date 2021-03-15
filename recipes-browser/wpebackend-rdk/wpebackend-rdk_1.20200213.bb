require wpebackend-rdk.inc

DEPENDS = "libwpe glib-2.0 libinput"

PV = "1.20200213"
SRCREV = "3ec8dfd1a1f1cede256fd5de0a63a8c6b6a31ffa"

SRC_URI = "git://github.com/WebPlatformForEmbedded/WPEBackend-rdk.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
