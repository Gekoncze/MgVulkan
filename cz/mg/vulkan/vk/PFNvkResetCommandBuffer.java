package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetCommandBuffer.html">khronos documentation</a>
 **/
public class PFNvkResetCommandBuffer extends VkFunctionPointer {
    public PFNvkResetCommandBuffer() {
    }

    public PFNvkResetCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkResetCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkResetCommandBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags, VkResult rval){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long flags, long rval);
}
