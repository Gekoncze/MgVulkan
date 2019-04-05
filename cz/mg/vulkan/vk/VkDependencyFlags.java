package cz.mg.vulkan.vk;

public class VkDependencyFlags extends VkFlags {
    public VkDependencyFlags() {
    }

    public VkDependencyFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDependencyFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDependencyFlags(int value) {
        setValue(value);
    }
}
