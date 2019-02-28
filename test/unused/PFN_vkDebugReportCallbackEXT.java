package test.unused;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.types.size_t;


/**
 *  typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
 *      VkDebugReportFlagsEXT                       flags,
 *      VkDebugReportObjectTypeEXT                  objectType,
 *      uint64_t                                    object,
 *      size_t                                      location,
 *      int32_t                                     messageCode,
 *      const char*                                 pLayerPrefix,
 *      const char*                                 pMessage,
 *      void*                                       pUserData
 *  );
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugReportCallbackEXT.html">khronos documentation</a>
 **/
public interface PFN_vkDebugReportCallbackEXT extends Callback {
    public int PFN_vkDebugReportCallbackEXT(
        VkDebugReportFlagsEXT.ByValue flags,
        VkDebugReportObjectTypeEXT.ByValue objectType,
        long object,
        size_t location,
        int messageCode,
        String pLayerPrefix,
        String pMessage,
        Pointer pUserData
    );
}
