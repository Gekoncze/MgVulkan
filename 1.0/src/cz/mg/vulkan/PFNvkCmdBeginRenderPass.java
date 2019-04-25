package cz.mg.vulkan;

public class PFNvkCmdBeginRenderPass extends VkFunctionPointer {
    public PFNvkCmdBeginRenderPass() {
    }

    protected PFNvkCmdBeginRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBeginRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBeginRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginRenderPass"));
    }

    public void call(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, VkSubpassContents contents){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pRenderPassBegin != null ? pRenderPassBegin.getVkAddress() : VkPointer.NULL, contents != null ? contents.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long pRenderPassBegin, long contents);
}
