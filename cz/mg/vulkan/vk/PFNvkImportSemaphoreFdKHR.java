package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkImportSemaphoreFdKHR.html">khronos documentation</a>
 **/
public class PFNvkImportSemaphoreFdKHR extends VkFunctionPointer {
    public PFNvkImportSemaphoreFdKHR() {
    }

    public PFNvkImportSemaphoreFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkImportSemaphoreFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkImportSemaphoreFdKHR(long value) {
        setValue(value);
    }

    public PFNvkImportSemaphoreFdKHR(VkInstance instance) {
        super(instance, new VkString("vkImportSemaphoreFdKHR"));
    }

    public void call(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pImportSemaphoreFdInfo, long rval);
}
