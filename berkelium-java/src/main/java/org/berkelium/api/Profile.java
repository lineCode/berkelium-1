// Copyright (c) 2013 The Berkelium Authors. All rights reserved.
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

// Represents a berkelium profile on disk.
public interface Profile extends BerkeliumObject  {

	// Returns the associated Runtime.
	Runtime getRuntime();

	// Returns true if this profile is already in use.
	boolean isInUse();

	// Returns true if this profile was found on disk.
	boolean isFound();

	// Returns true if this profile can be used without updating this profile to a newer version.
	boolean isSameVersion();

	// Returns true if this profile is from a newer berkelium host version.
	boolean isTooNew();

	// Returns the name of the application or "berkelium" if not specified.
	String getApplicationName();

	// Returns the full path to the used Profile.
	String getProfilePath();

	// Lock or Unlock the Profile so another instance can't open it for writing.
	void setLocked(boolean locked);

	// Returns true if this Profile instance holds the Profile lock.
	boolean isLocked();
}
