package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugReportCallbackEXT;
import cz.mg.vulkan.jna.enums.VkStructureType;
import cz.mg.vulkan.jna.flags.VkDebugReportFlagsEXT;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkDebugReportCallbackCreateInfoEXT {
 *      VkStructureType                 sType;
 *      const void*                     pNext;
 *      VkDebugReportFlagsEXT           flags;
 *      PFN_vkDebugReportCallbackEXT    pfnCallback;
 *      void*                           pUserData;
 *  } VkDebugReportCallbackCreateInfoEXT;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportCallbackCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkDebugReportCallbackCreateInfoEXT extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkDebugReportFlagsEXT flags;
    public PFN_vkDebugReportCallbackEXT pfnCallback;
    public Pointer pUserData;

    public VkDebugReportCallbackCreateInfoEXT() {
    }

    public VkDebugReportCallbackCreateInfoEXT(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "pfnCallback",
                "pUserData"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkDebugReportCallbackCreateInfoEXT implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkDebugReportCallbackCreateInfoEXT implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
