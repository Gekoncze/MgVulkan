package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkExternalMemoryHandleTypeFlagBitsKHR extends VkFlagBits {
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x00000004;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR = 0x00000008;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR = 0x00000010;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR = 0x00000020;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR = 0x00000040;

    public VkExternalMemoryHandleTypeFlagBitsKHR() {
    }

    public VkExternalMemoryHandleTypeFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryHandleTypeFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryHandleTypeFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkExternalMemoryHandleTypeFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR");
        if((getValue() & VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR) != 0) s.addLast("VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
