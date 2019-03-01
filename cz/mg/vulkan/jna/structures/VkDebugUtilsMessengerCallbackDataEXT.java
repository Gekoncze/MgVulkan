package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDebugUtilsMessengerCallbackDataEXT {
 *      VkStructureType                              sType;
 *      const void*                                  pNext;
 *      VkDebugUtilsMessengerCallbackDataFlagsEXT    flags;
 *      const char*                                  pMessageIdName;
 *      int32_t                                      messageIdNumber;
 *      const char*                                  pMessage;
 *      uint32_t                                     queueLabelCount;
 *      VkDebugUtilsLabelEXT*                        pQueueLabels;
 *      uint32_t                                     cmdBufLabelCount;
 *      VkDebugUtilsLabelEXT*                        pCmdBufLabels;
 *      uint32_t                                     objectCount;
 *      VkDebugUtilsObjectNameInfoEXT*               pObjects;
 *  } VkDebugUtilsMessengerCallbackDataEXT;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCallbackDataEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsMessengerCallbackDataEXT extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
    public String pMessageIdName;
    public int32_t messageIdNumber;
    public String pMessage;
    public uint32_t queueLabelCount;
    public Pointer pQueueLabels;
    public uint32_t cmdBufLabelCount;
    public Pointer pCmdBufLabels;
    public uint32_t objectCount;
    public Pointer pObjects;

    public VkDebugUtilsMessengerCallbackDataEXT() {
    }

    public VkDebugUtilsMessengerCallbackDataEXT(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "pMessageIdName",
                "messageIdNumber",
                "pMessage",
                "queueLabelCount",
                "pQueueLabels",
                "cmdBufLabelCount",
                "pCmdBufLabels",
                "objectCount",
                "pObjects"
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

    public static class ByReference extends VkDebugUtilsMessengerCallbackDataEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDebugUtilsMessengerCallbackDataEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
