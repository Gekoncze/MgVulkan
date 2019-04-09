package cz.mg.vulkan;

public class VkExternalFenceHandleTypeFlagBits extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 0x00000004;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 0x00000008;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;

    public VkExternalFenceHandleTypeFlagBits() {
    }

    public VkExternalFenceHandleTypeFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceHandleTypeFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExternalFenceHandleTypeFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR";
        if(getValue() == VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR) s += "VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
