// Copyright (c) 2012 The Berkelium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.berkelium.api;

// =========================================
// WARNING:
//   THIS FILE IS AUTOMATICALLY GENERATED!
//   !! ANY CHANGES WILL BE OVERWRITTEN !!
//
// See berkelium/berkelium-api/update.sh
// =========================================

// Represents a running berkelium host instance.
public interface Instance {

	// Internal Update Function
	void internalUpdate();

	// Closes all open Windows/Tabs and the profile, terminates the host.
	void close();

	// Returns the profile used to launch this instance.
	Profile getProfile();

	// Returns the executable used to launch this instance.
	HostExecutable getExecutable();

	// Add the given LogDelegate to this Instance.
	void addLogDelegate(LogDelegate delegate);

	// Remove the given LogDelegate from this Instance.
	void removeLogDelegate(LogDelegate delegate);

	// Add the given HostDelegate to this Instance.
	void addHostDelegate(HostDelegate delegate);

	// Remove the given HostDelegate from this Instance.
	void removeHostDelegate(HostDelegate delegate);

	// Forwards the given type/message to all log handlers attached to this instance.
	void log(LogType type, String message);

	// Error handler used by this instance.
	void handleThrowable(Throwable t);

	// Returns the number of active Windows.
	int getWindowCount();

	// Returns a list of all active windows.
	java.util.List<Window> getWindowList();

	// Open a new window.
	Window createWindow(boolean incognito);
}
