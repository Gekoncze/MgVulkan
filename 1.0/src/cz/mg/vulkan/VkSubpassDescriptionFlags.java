package cz.mg.vulkan;

public class VkSubpassDescriptionFlags extends VkFlags {
    public VkSubpassDescriptionFlags() {
    }

    public VkSubpassDescriptionFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassDescriptionFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSubpassDescriptionFlags(int value) {
        setValue(value);
    }
}
