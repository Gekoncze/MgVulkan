package cz.mg.vulkan;

public class PFNvkCmdSetBlendConstants extends VkFunctionPointer {
    public PFNvkCmdSetBlendConstants() {
    }

    public PFNvkCmdSetBlendConstants(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetBlendConstants(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetBlendConstants(long value) {
        setValue(value);
    }

    public PFNvkCmdSetBlendConstants(VkInstance instance) {
        super(instance, new VkString("vkCmdSetBlendConstants"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat blendConstants){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), blendConstants != null ? blendConstants.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long blendConstants);
}
