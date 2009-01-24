# Arago base image
# gives you a small images with basic media libraries

ARAGO_ALSA = "\
    alsa-utils \
    alsa-utils-aplay \
    "

# cppstub is needed to install libstdc++ in the image
ARAGO_EXTRA_INSTALL = "\
    ${ARAGO_ALSA} \
    opkg-nogpg \
    "

# Disable this due to distribution restrictions
# DISTRO_SSH_DAEMON ?= "dropbear"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

# Disable these for now
# util-linux-mount util-linux-umount \

IMAGE_INSTALL = "\
    task-arago-base \
    ${DISTRO_SSH_DAEMON} \
    angstrom-version \
    ${ARAGO_EXTRA_INSTALL} \
    "

export IMAGE_BASENAME = "arago-base-image"
IMAGE_LINGUAS = ""

inherit image
