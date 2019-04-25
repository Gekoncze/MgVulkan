package cz.mg.vulkan;

public class VkSubpassDescriptionFlags extends VkFlags {
    public VkSubpassDescriptionFlags() {
    }

    protected VkSubpassDescriptionFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubpassDescriptionFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassDescriptionFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSubpassDescriptionFlags(int value) {
        setValue(value);
    }
}
