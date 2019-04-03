package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreHandleTypeFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreHandleTypeFlagBits extends VulkanFlagBits {
    public static final int OPAQUE_FD = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int OPAQUE_WIN32 = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int OPAQUE_WIN32_KMT = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int D3D12_FENCE = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT;
    public static final int SYNC_FD = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int OPAQUE_FD_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR;
    public static final int OPAQUE_WIN32_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR;
    public static final int OPAQUE_WIN32_KMT_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR;
    public static final int D3D12_FENCE_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR;
    public static final int SYNC_FD_KHR = VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR;

    public VulkanExternalSemaphoreHandleTypeFlagBits(){
        super(new VkExternalSemaphoreHandleTypeFlagBits());
    }

    public VulkanExternalSemaphoreHandleTypeFlagBits(VkExternalSemaphoreHandleTypeFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreHandleTypeFlagBits getVk(){
        return (VkExternalSemaphoreHandleTypeFlagBits) super.getVk();
    }

    public VulkanExternalSemaphoreHandleTypeFlagBits(int value){
        super(new VkExternalSemaphoreHandleTypeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_FD) s += "OPAQUE_FD";
        if(getValue() == OPAQUE_WIN32) s += "OPAQUE_WIN32";
        if(getValue() == OPAQUE_WIN32_KMT) s += "OPAQUE_WIN32_KMT";
        if(getValue() == D3D12_FENCE) s += "D3D12_FENCE";
        if(getValue() == SYNC_FD) s += "SYNC_FD";
        if(getValue() == OPAQUE_FD_KHR) s += "OPAQUE_FD_KHR";
        if(getValue() == OPAQUE_WIN32_KHR) s += "OPAQUE_WIN32_KHR";
        if(getValue() == OPAQUE_WIN32_KMT_KHR) s += "OPAQUE_WIN32_KMT_KHR";
        if(getValue() == D3D12_FENCE_KHR) s += "D3D12_FENCE_KHR";
        if(getValue() == SYNC_FD_KHR) s += "SYNC_FD_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
