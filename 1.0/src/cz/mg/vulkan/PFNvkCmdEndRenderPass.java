package cz.mg.vulkan;

public class PFNvkCmdEndRenderPass extends VkFunctionPointer {
    public PFNvkCmdEndRenderPass() {
    }

    public PFNvkCmdEndRenderPass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdEndRenderPass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdEndRenderPass(long value) {
        setValue(value);
    }

    public PFNvkCmdEndRenderPass(VkInstance instance) {
        super(instance, new VkString("vkCmdEndRenderPass"));
    }

    public void call(VkCommandBuffer commandBuffer){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long commandBuffer);
}
