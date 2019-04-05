package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalFenceHandleTypeFlagBits extends VulkanFlagBits {
    public static final int OPAQUE_FD = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int OPAQUE_WIN32 = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int OPAQUE_WIN32_KMT = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int SYNC_FD = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int OPAQUE_FD_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int OPAQUE_WIN32_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int OPAQUE_WIN32_KMT_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int SYNC_FD_KHR = VkExternalFenceHandleTypeFlagBits.VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR;

    public VulkanExternalFenceHandleTypeFlagBits(){
        super(new VkExternalFenceHandleTypeFlagBits());
    }

    public VulkanExternalFenceHandleTypeFlagBits(VkExternalFenceHandleTypeFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalFenceHandleTypeFlagBits getVk(){
        return (VkExternalFenceHandleTypeFlagBits) super.getVk();
    }

    public VulkanExternalFenceHandleTypeFlagBits(int value){
        super(new VkExternalFenceHandleTypeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_FD) s += "OPAQUE_FD";
        if(getValue() == OPAQUE_WIN32) s += "OPAQUE_WIN32";
        if(getValue() == OPAQUE_WIN32_KMT) s += "OPAQUE_WIN32_KMT";
        if(getValue() == SYNC_FD) s += "SYNC_FD";
        if(getValue() == OPAQUE_FD_KHR) s += "OPAQUE_FD_KHR";
        if(getValue() == OPAQUE_WIN32_KHR) s += "OPAQUE_WIN32_KHR";
        if(getValue() == OPAQUE_WIN32_KMT_KHR) s += "OPAQUE_WIN32_KMT_KHR";
        if(getValue() == SYNC_FD_KHR) s += "SYNC_FD_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
