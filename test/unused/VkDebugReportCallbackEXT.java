package test.unused;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  VkDebugReportCallbackEXT_T* object
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportCallbackEXT.html">khronos documentation</a>
 **/
public class VkDebugReportCallbackEXT extends Structure {
    public Pointer ptr;

    public VkDebugReportCallbackEXT() {
    }

    public VkDebugReportCallbackEXT(VkDebugReportCallbackEXT object) {
        this.ptr = object.ptr;
    }

    public VkDebugReportCallbackEXT(Pointer pointer) {
        super(pointer);
    }

    public static class ByReference extends VkDebugReportCallbackEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(VkDebugReportCallbackEXT object){
            super(object.ptr);
        }
    }

    public static class ByValue extends VkDebugReportCallbackEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(VkDebugReportCallbackEXT object){
            super(object);
        }
    }
}
