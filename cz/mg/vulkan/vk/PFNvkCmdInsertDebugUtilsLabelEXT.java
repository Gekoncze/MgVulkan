package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdInsertDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class PFNvkCmdInsertDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdInsertDebugUtilsLabelEXT() {
    }

    public PFNvkCmdInsertDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdInsertDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdInsertDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdInsertDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdInsertDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer, VkDebugUtilsLabelEXT pLabelInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pLabelInfo != null ? pLabelInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pLabelInfo);
}
