package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkAccessFlagBits extends VkFlagBits {
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x00000001;
    public static final int VK_ACCESS_INDEX_READ_BIT = 0x00000002;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 0x00000008;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x00000010;
    public static final int VK_ACCESS_SHADER_READ_BIT = 0x00000020;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 0x00000040;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x00000080;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 0x00000800;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 0x00001000;
    public static final int VK_ACCESS_HOST_READ_BIT = 0x00002000;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 0x00004000;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 0x00008000;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 0x00010000;
    public static final int VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX = 0x00040000;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x00080000;

    public VkAccessFlagBits() {
    }

    protected VkAccessFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAccessFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAccessFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkAccessFlagBits(int value) {
        setValue(value);
    }

    public VkAccessFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_ACCESS_INDIRECT_COMMAND_READ_BIT) != 0) s.addLast("VK_ACCESS_INDIRECT_COMMAND_READ_BIT");
        if((getValue() & VK_ACCESS_INDEX_READ_BIT) != 0) s.addLast("VK_ACCESS_INDEX_READ_BIT");
        if((getValue() & VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT) != 0) s.addLast("VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT");
        if((getValue() & VK_ACCESS_UNIFORM_READ_BIT) != 0) s.addLast("VK_ACCESS_UNIFORM_READ_BIT");
        if((getValue() & VK_ACCESS_INPUT_ATTACHMENT_READ_BIT) != 0) s.addLast("VK_ACCESS_INPUT_ATTACHMENT_READ_BIT");
        if((getValue() & VK_ACCESS_SHADER_READ_BIT) != 0) s.addLast("VK_ACCESS_SHADER_READ_BIT");
        if((getValue() & VK_ACCESS_SHADER_WRITE_BIT) != 0) s.addLast("VK_ACCESS_SHADER_WRITE_BIT");
        if((getValue() & VK_ACCESS_COLOR_ATTACHMENT_READ_BIT) != 0) s.addLast("VK_ACCESS_COLOR_ATTACHMENT_READ_BIT");
        if((getValue() & VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT) != 0) s.addLast("VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT");
        if((getValue() & VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT) != 0) s.addLast("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT");
        if((getValue() & VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT) != 0) s.addLast("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT");
        if((getValue() & VK_ACCESS_TRANSFER_READ_BIT) != 0) s.addLast("VK_ACCESS_TRANSFER_READ_BIT");
        if((getValue() & VK_ACCESS_TRANSFER_WRITE_BIT) != 0) s.addLast("VK_ACCESS_TRANSFER_WRITE_BIT");
        if((getValue() & VK_ACCESS_HOST_READ_BIT) != 0) s.addLast("VK_ACCESS_HOST_READ_BIT");
        if((getValue() & VK_ACCESS_HOST_WRITE_BIT) != 0) s.addLast("VK_ACCESS_HOST_WRITE_BIT");
        if((getValue() & VK_ACCESS_MEMORY_READ_BIT) != 0) s.addLast("VK_ACCESS_MEMORY_READ_BIT");
        if((getValue() & VK_ACCESS_MEMORY_WRITE_BIT) != 0) s.addLast("VK_ACCESS_MEMORY_WRITE_BIT");
        if((getValue() & VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX) != 0) s.addLast("VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX");
        if((getValue() & VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX) != 0) s.addLast("VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX");
        if((getValue() & VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT) != 0) s.addLast("VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
