package cz.mg.vulkan;

public class VkPipelineInputAssemblyStateCreateFlags extends VkFlags {
    public VkPipelineInputAssemblyStateCreateFlags() {
    }

    public VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineInputAssemblyStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineInputAssemblyStateCreateFlags(int value) {
        setValue(value);
    }
}
