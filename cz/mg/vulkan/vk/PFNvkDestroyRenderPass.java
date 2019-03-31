package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDestroyRenderPass.html">khronos documentation</a>
 **/
public class PFNvkDestroyRenderPass extends VkFunctionPointer {
    public PFNvkDestroyRenderPass() {
    }

    public PFNvkDestroyRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDestroyRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDestroyRenderPass(long value) {
        setValue(value);
    }

    public PFNvkDestroyRenderPass(VkInstance instance) {
        super(instance, new VkString("vkDestroyRenderPass"));
    }

    public void call(VkDevice device, VkRenderPass renderPass, VkAllocationCallbacks pAllocator){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkRenderPass.NULL.getVkAddress(), pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long renderPass, long pAllocator);
}
