package cz.mg.vulkan;

public class VkCompositeAlphaFlagsKHR extends VkFlags {
    public VkCompositeAlphaFlagsKHR() {
    }

    protected VkCompositeAlphaFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCompositeAlphaFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCompositeAlphaFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkCompositeAlphaFlagsKHR(int value) {
        setValue(value);
    }
}
