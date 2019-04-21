package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalFenceHandleTypeFlagBitsKHR extends VkFlagBits {
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = 0x00000002;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x00000004;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = 0x00000008;

    public VkExternalFenceHandleTypeFlagBitsKHR() {
    }

    public VkExternalFenceHandleTypeFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceHandleTypeFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceHandleTypeFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkExternalFenceHandleTypeFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR");
        if((getValue() & VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
