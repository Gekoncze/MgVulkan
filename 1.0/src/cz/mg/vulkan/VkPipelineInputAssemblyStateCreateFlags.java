package cz.mg.vulkan;

public class VkPipelineInputAssemblyStateCreateFlags extends VkFlags {
    public VkPipelineInputAssemblyStateCreateFlags() {
    }

    protected VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineInputAssemblyStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineInputAssemblyStateCreateFlags(int value) {
        setValue(value);
    }
}
