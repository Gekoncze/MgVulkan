package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessengerCreateInfoEXT extends VulkanObject {
    public VulkanDebugUtilsMessengerCreateInfoEXT(){
        super(new VkDebugUtilsMessengerCreateInfoEXT());
    }

    public VulkanDebugUtilsMessengerCreateInfoEXT(VkDebugUtilsMessengerCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCreateInfoEXT getVk(){
        return (VkDebugUtilsMessengerCreateInfoEXT) super.getVk();
    }
    public VulkanDebugUtilsMessengerCreateInfoEXT(VulkanObject pNext, VulkanDebugUtilsMessengerCreateFlagsEXT flags, VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageType, PFNDebugUtilsMessengerCallbackEXT pfnUserCallback, VulkanObject pUserData) {
        super(new VkDebugUtilsMessengerCreateInfoEXT(pNext.getVk(), flags.getVk(), messageSeverity.getVk(), messageType.getVk(), pfnUserCallback.getVk(), pUserData.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT getFlags() {
        return new VulkanDebugUtilsMessengerCreateFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanDebugUtilsMessengerCreateFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanDebugUtilsMessageSeverityFlagsEXT getMessageSeverity() {
        return new VulkanDebugUtilsMessageSeverityFlagsEXT(getVk().getMessageSeverity());
    }

    public void setMessageSeverity(VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity) {
        getVk().setMessageSeverity(messageSeverity.getVk());
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT getMessageType() {
        return new VulkanDebugUtilsMessageTypeFlagsEXT(getVk().getMessageType());
    }

    public void setMessageType(VulkanDebugUtilsMessageTypeFlagsEXT messageType) {
        getVk().setMessageType(messageType.getVk());
    }

    public PFNDebugUtilsMessengerCallbackEXT getPfnUserCallback() {
        return new PFNDebugUtilsMessengerCallbackEXT(getVk().getPfnUserCallback());
    }

    public void setPfnUserCallback(PFNDebugUtilsMessengerCallbackEXT pfnUserCallback) {
        getVk().setPfnUserCallback(pfnUserCallback.getVk());
    }

    public VulkanObject getPUserData() {
        return new VulkanObject(getVk().getPUserData());
    }

    public void setPUserData(VulkanObject pUserData) {
        getVk().setPUserData(pUserData.getVk());
    }


    public static class Array extends VulkanDebugUtilsMessengerCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCreateInfoEXT> {
        public Array(VkDebugUtilsMessengerCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessengerCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessengerCreateInfoEXT o){
            this(new VkDebugUtilsMessengerCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerCreateInfoEXT.Array getVk(){
            return (VkDebugUtilsMessengerCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerCreateInfoEXT get(int i){
            return new VulkanDebugUtilsMessengerCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessengerCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessengerCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessengerCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessengerCreateInfoEXT.Pointer getVk(){
            return (VkDebugUtilsMessengerCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessengerCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessengerCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessengerCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessengerCreateInfoEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessengerCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessengerCreateInfoEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessengerCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
