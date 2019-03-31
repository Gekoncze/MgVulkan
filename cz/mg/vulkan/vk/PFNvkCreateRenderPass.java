package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateRenderPass.html">khronos documentation</a>
 **/
public class PFNvkCreateRenderPass extends VkFunctionPointer {
    public PFNvkCreateRenderPass() {
    }

    public PFNvkCreateRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCreateRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCreateRenderPass"));
    }

    public void call(VkDevice device, VkRenderPassCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkRenderPass pRenderPass, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pRenderPass != null ? pRenderPass.getVkAddress() : VkRenderPass.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pRenderPass, long rval);
}
