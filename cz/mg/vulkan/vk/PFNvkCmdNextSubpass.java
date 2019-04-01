package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdNextSubpass.html">khronos documentation</a>
 **/
public class PFNvkCmdNextSubpass extends VkFunctionPointer {
    public PFNvkCmdNextSubpass() {
    }

    public PFNvkCmdNextSubpass(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdNextSubpass(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdNextSubpass(long value) {
        setValue(value);
    }

    public PFNvkCmdNextSubpass(VkInstance instance) {
        super(instance, new VkString("vkCmdNextSubpass"));
    }

    public void call(VkCommandBuffer commandBuffer, VkSubpassContents contents){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, contents != null ? contents.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long contents);
}
