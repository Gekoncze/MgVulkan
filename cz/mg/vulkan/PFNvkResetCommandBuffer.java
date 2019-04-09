package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long flags, long rval);
}
