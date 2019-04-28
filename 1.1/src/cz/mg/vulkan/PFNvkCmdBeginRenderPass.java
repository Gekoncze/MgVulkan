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

    public void call(VkCommandBuffer commandBuffer, VkRenderPassBeginInfo pRenderPassBegin, int contents){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pRenderPassBegin != null ? pRenderPassBegin.getVkAddress() : VkPointer.NULL, contents);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pRenderPassBegin, int contents);

}
