package cz.mg.vulkan;

public class VkDependencyFlags extends VkFlags {
    public VkDependencyFlags() {
    }

    protected VkDependencyFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDependencyFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDependencyFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDependencyFlags(int value) {
        setValue(value);
    }
}
