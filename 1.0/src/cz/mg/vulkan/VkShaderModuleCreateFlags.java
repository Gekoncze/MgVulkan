package cz.mg.vulkan;

public class VkShaderModuleCreateFlags extends VkFlags {
    public VkShaderModuleCreateFlags() {
    }

    protected VkShaderModuleCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkShaderModuleCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderModuleCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkShaderModuleCreateFlags(int value) {
        setValue(value);
    }
}
