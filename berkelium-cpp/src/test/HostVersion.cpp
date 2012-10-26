#include "berkelium/HostVersion.hpp"
#include "berkelium/Impl.hpp"
#include "gtest/gtest.h"

namespace {

class HostVersionTest : public ::testing::Test {
};

void test(Berkelium::HostVersionRef subject, int32_t major, int32_t minor, int32_t build, int32_t patch, const std::string& ver) {
	ASSERT_TRUE(subject); // not NULL
	ASSERT_EQ(major, subject->getMajor());
	ASSERT_EQ(minor, subject->getMinor());
	ASSERT_EQ(build, subject->getBuild());
	ASSERT_EQ(patch, subject->getPatch());
	ASSERT_EQ(0, ver.compare(subject->getVersionString()));
}

TEST_F(HostVersionTest, test1) {
	test(Berkelium::impl::newHostVersion(0, 0, 0, 0), 0, 0, 0, 0, "0.0.0.0");
}

TEST_F(HostVersionTest, test2) {
	test(Berkelium::impl::newHostVersion(1, 2, 3, 4), 1, 2, 3, 4, "1.2.3.4");
}

TEST_F(HostVersionTest, test3) {
	test(Berkelium::impl::newHostVersion("0.0.0.0"), 0, 0, 0, 0, "0.0.0.0");
}

TEST_F(HostVersionTest, test4) {
	test(Berkelium::impl::newHostVersion("1.2.3.4"), 1, 2, 3, 4, "1.2.3.4");
}

TEST_F(HostVersionTest, err1) {
	ASSERT_FALSE(Berkelium::impl::newHostVersion("0.0.0.0 ")); // NULL
}

TEST_F(HostVersionTest, err2) {
	ASSERT_FALSE(Berkelium::impl::newHostVersion("0.0.a.0")); // NULL
}

TEST_F(HostVersionTest, err3) {
	ASSERT_FALSE(Berkelium::impl::newHostVersion("0.0.0")); // NULL
}

TEST_F(HostVersionTest, err4) {
	ASSERT_FALSE(Berkelium::impl::newHostVersion("0.0.0.0.0")); // NULL
}

} // namespace
