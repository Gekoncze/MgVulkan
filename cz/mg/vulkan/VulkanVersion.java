package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanVersion {
    private final VulkanInt32 value;

    public VulkanVersion(){
        this(new VulkanInt32());
    }

    public VulkanVersion(VulkanInt32 value){
        this.value = value;
    }

    public VulkanVersion(int value){
        this(new VulkanInt32(value));
    }

    public VulkanVersion(int major, int minor, int patch){
        this(VK_MAKE_VERSION(major, minor, patch));
    }

    public int getMajorVersion(){
        return VK_VERSION_MAJOR(value.getValue());
    }

    public int getMinorVersion(){
        return VK_VERSION_MINOR(value.getValue());
    }

    public int getPatchVersion(){
        return VK_VERSION_PATCH(value.getValue());
    }
}
