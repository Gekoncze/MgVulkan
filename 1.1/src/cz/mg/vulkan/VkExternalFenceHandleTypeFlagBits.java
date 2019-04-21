package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

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

    public VkExternalFenceHandleTypeFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
