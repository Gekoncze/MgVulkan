package cz.mg.vulkan.structures;

import com.sun.jna.Pointer;
import cz.mg.vulkan.enums.VulkanStructureType;
import cz.mg.vulkan.flags.*;
import cz.mg.vulkan.jna.structures.*;


public class VulkanDebugUtilsMessengerCallbackDataEXT {
    public final VkDebugUtilsMessengerCallbackDataEXT structure;

    public VulkanDebugUtilsMessengerCallbackDataEXT() {
        this(new VkDebugUtilsMessengerCallbackDataEXT());
    }

    public VulkanDebugUtilsMessengerCallbackDataEXT(VkDebugUtilsMessengerCallbackDataEXT structure) {
        if(structure == null) throw new IllegalArgumentException();
        this.structure = structure;
    }

    public VulkanStructureType getSType(){
        return VulkanStructureType.fromNativeEnum(structure.sType);
    }

    public Pointer getPNext(){
        return structure.pNext;
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT getFlags(){
        return new VulkanDebugUtilsMessengerCallbackDataFlagsEXT(structure.flags);
    }

    public String getPMessageIdName(){
        return structure.pMessageIdName;
    }

    public int getMessageIdNumber(){
        return structure.messageIdNumber.intValue();
    }

    public String getPMessage(){
        return structure.pMessage;
    }

    public int getQueueLabelCount(){
        return structure.queueLabelCount.intValue();
    }

    public Pointer getPQueueLabels(){
        return structure.pQueueLabels;
    }

    public int getCmdBufLabelCount(){
        return structure.cmdBufLabelCount.intValue();
    }

    public Pointer getPCmdBufLabels(){
        return structure.pCmdBufLabels;
    }

    public int getObjectCount(){
        return structure.objectCount.intValue();
    }

    public Pointer getPObjects(){
        return structure.pObjects;
    }
}
