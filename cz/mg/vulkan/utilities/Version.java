package cz.mg.vulkan.utilities;

import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.types.uint32_t;
import cz.mg.vulkan.jna.utilities.ToString;


public class Version {
    private uint32_t value;

    public Version(uint32_t value){
        this.value = value;
    }

    public Version(int major, int minor, int patch) {
        if(major < 0 || minor < 0 || patch < 0) throw new IllegalArgumentException("Version numbers cannot be negative. Given: " + major + "." + minor + "." + patch);
        if(major > 255 || minor > 255 || patch > 255) throw new IllegalArgumentException("Version numbers cannot be greater than 255. Given: " + major + "." + minor + "." + patch);
        this.value = Vk.VK_MAKE_VERSION(major, minor, patch);
    }

    public uint32_t getValue() {
        return value;
    }

    public int getMajorVersion(){
        return Vk.VK_VERSION_MAJOR(value);
    }

    public int getMinorVersion(){
        return Vk.VK_VERSION_MINOR(value);
    }

    public int getPatchVersion(){
        return Vk.VK_VERSION_PATCH(value);
    }

    @Override
    public String toString() {
        return ToString.versionToString(value);
    }
}
