package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDebugUtilsMessengerCreateInfoEXT {
 *      VkStructureType                         sType;
 *      const void*                             pNext;
 *      VkDebugUtilsMessengerCreateFlagsEXT     flags;
 *      VkDebugUtilsMessageSeverityFlagsEXT     messageSeverity;
 *      VkDebugUtilsMessageTypeFlagsEXT         messageType;
 *      PFN_vkDebugUtilsMessengerCallbackEXT    pfnUserCallback;
 *      void*                                   pUserData;
 *  } VkDebugUtilsMessengerCreateInfoEXT;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCreateInfoEXT extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkDebugUtilsMessengerCreateFlagsEXT flags;
    public VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
    public VkDebugUtilsMessageTypeFlagsEXT messageType;
    public PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
    public Pointer pUserData;

    public VkDebugUtilsMessengerCreateInfoEXT() {
    }

    public VkDebugUtilsMessengerCreateInfoEXT(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "messageSeverity",
                "messageType",
                "pfnUserCallback",
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

    public static class ByReference extends VkDebugUtilsMessengerCreateInfoEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDebugUtilsMessengerCreateInfoEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
