package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyPipelineLayout.html">khronos documentation</a>
 **/
public class PFNvkDestroyPipelineLayout extends VkFunctionPointer {
    public PFNvkDestroyPipelineLayout() {
    }

    public PFNvkDestroyPipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyPipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyPipelineLayout(long value) {
        setValue(value);
    }

    public PFNvkDestroyPipelineLayout(VkInstance instance) {
        super(instance, new VkString("vkDestroyPipelineLayout"));
    }

    public void call(VkDevice device, VkPipelineLayout pipelineLayout, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.NULL_ADDRESS, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pipelineLayout, long pAllocator);
}
