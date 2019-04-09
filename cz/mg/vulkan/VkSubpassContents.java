package cz.mg.vulkan;

public class VkSubpassContents extends VkEnum {
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

    public VkSubpassContents() {
    }

    public VkSubpassContents(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassContents(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSubpassContents(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SUBPASS_CONTENTS_INLINE) return "VK_SUBPASS_CONTENTS_INLINE";
        if(getValue() == VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS) return "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS";
        return "UNKNOWN";
    }
}
