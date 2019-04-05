package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalMemoryHandleTypeFlagBitsNV extends VulkanFlagBits {
    public static final int OPAQUE_WIN32_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV;
    public static final int OPAQUE_WIN32_KMT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV;
    public static final int D3D11_IMAGE_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV;
    public static final int D3D11_IMAGE_KMT_NV = VkExternalMemoryHandleTypeFlagBitsNV.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV;

    public VulkanExternalMemoryHandleTypeFlagBitsNV(){
        super(new VkExternalMemoryHandleTypeFlagBitsNV());
    }

    public VulkanExternalMemoryHandleTypeFlagBitsNV(VkExternalMemoryHandleTypeFlagBitsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlagBitsNV getVk(){
        return (VkExternalMemoryHandleTypeFlagBitsNV) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlagBitsNV(int value){
        super(new VkExternalMemoryHandleTypeFlagBitsNV(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OPAQUE_WIN32_NV) s += "OPAQUE_WIN32_NV";
        if(getValue() == OPAQUE_WIN32_KMT_NV) s += "OPAQUE_WIN32_KMT_NV";
        if(getValue() == D3D11_IMAGE_NV) s += "D3D11_IMAGE_NV";
        if(getValue() == D3D11_IMAGE_KMT_NV) s += "D3D11_IMAGE_KMT_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
