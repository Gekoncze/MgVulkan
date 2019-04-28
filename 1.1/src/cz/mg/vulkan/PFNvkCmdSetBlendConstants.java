package cz.mg.vulkan;

public class PFNvkCmdSetBlendConstants extends VkFunctionPointer {
    public PFNvkCmdSetBlendConstants() {
    }

    protected PFNvkCmdSetBlendConstants(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdSetBlendConstants(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetBlendConstants(long value) {
        setValue(value);
    }

    public PFNvkCmdSetBlendConstants(VkInstance instance) {
        super(instance, new VkString("vkCmdSetBlendConstants"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat blendConstants){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), blendConstants != null ? blendConstants.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long blendConstants);



}
