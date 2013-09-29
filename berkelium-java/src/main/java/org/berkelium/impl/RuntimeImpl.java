// Copyright (c) 2013 The Berkelium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.berkelium.impl;

import org.berkelium.api.HostExecutable;
import org.berkelium.api.HostVersion;
import org.berkelium.api.Instance;
import org.berkelium.api.LogDelegate;
import org.berkelium.api.LogSource;
import org.berkelium.api.LogType;
import org.berkelium.api.Logger;
import org.berkelium.api.Profile;
import org.berkelium.api.Runtime;

// =========================================
// WARNING:
//   THIS FILE IS AUTOMATICALLY GENERATED!
//   !! ANY CHANGES WILL BE OVERWRITTEN !!
//
// See berkelium/berkelium-api/update.sh
// =========================================

class RuntimeImpl implements Runtime, BerkeliumObjectImpl {

	@Override
	public native void dispose();

	@Override
	public native void setDefaultExecutable(String pathTo);

	@Override
	public native HostExecutable forExecutable(String pathTo);

	@Override
	public native HostExecutable forSystemInstalled();

	@Override
	public native Profile forProfile(String application);

	@Override
	public native Profile getChromeProfile();

	@Override
	public native Profile getChromiumProfile();

	@Override
	public native Profile forProfilePath(String path);

	@Override
	public native Profile createTemporaryProfile();

	@Override
	public native HostVersion forVersion(String version);

	@Override
	public native HostVersion forVersion(int vMajor, int vMinor, int vBuild, int vPatch);

	@Override
	public native Instance open(HostExecutable executable, Profile profile);

	@Override
	public native Logger getLogger(String clazz, String name);

	@Override
	public native void addLogDelegate(LogDelegate delegate);

	@Override
	public native void removeLogDelegate(LogDelegate delegate);

	@Override
	public native void log(LogSource source, LogType type, String clazz, String name, String message);

	@Override
	public native void handleThrowable(Throwable t);
}