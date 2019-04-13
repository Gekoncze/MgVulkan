package cz.mg.vulkan;

public class PFNvkCmdSetDepthBounds extends VkFunctionPointer {
    public PFNvkCmdSetDepthBounds() {
    }

    public PFNvkCmdSetDepthBounds(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDepthBounds(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDepthBounds(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBounds(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBounds"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat minDepthBounds, VkFloat maxDepthBounds){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), minDepthBounds != null ? minDepthBounds.getVkAddress() : VkPointer.getSinkAddress(), maxDepthBounds != null ? maxDepthBounds.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long minDepthBounds, long maxDepthBounds);
}
