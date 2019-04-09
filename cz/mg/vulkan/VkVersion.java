package cz.mg.vulkan;

import static cz.mg.vulkan.Vk.*;

public class VkVersion extends VkInt32 {
    public VkVersion(){
    }

    public VkVersion(int value){
        super(value);
    }

    public VkVersion(int major, int minor, int patch){
        this(VK_MAKE_VERSION(major, minor, patch));
    }

    public int getMajorVersion(){
        return VK_VERSION_MAJOR(getValue());
    }

    public int getMinorVersion(){
        return VK_VERSION_MINOR(getValue());
    }

    public int getPatchVersion(){
        return VK_VERSION_PATCH(getValue());
    }
}
