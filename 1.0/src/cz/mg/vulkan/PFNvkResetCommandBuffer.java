package cz.mg.vulkan;

public class PFNvkResetCommandBuffer extends VkFunctionPointer {
    public PFNvkResetCommandBuffer() {
    }

    protected PFNvkResetCommandBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkResetCommandBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkResetCommandBuffer(long value) {
        setValue(value);
    }

    public PFNvkResetCommandBuffer(VkInstance instance) {
        super(instance, new VkString("vkResetCommandBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCommandBufferResetFlags flags, VkResult rval){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long flags, long rval);
}
