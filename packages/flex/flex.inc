DESCRIPTION = "Flex is a tool for generating programs that recognize lexical patterns in text."
SECTION = "devel"
LICENSE = "BSD"

SRC_URI = "${SOURCEFORGE_MIRROR}/flex/flex-${PV}.tar.bz2"
S = "${WORKDIR}/flex-${PV}"

inherit autotools

