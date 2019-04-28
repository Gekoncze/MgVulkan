package cz.mg.vulkan;

public class PFNvkCmdDispatch extends VkFunctionPointer {
    public PFNvkCmdDispatch() {
    }

    protected PFNvkCmdDispatch(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdDispatch(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatch(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatch(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatch"));
    }

    public void call(VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), groupCountX, groupCountY, groupCountZ);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int groupCountX, int groupCountY, int groupCountZ);

}
