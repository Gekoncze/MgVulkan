package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugReportCallbackCreateInfoEXT extends VulkanObject {
    public VulkanDebugReportCallbackCreateInfoEXT(){
        super(new VkDebugReportCallbackCreateInfoEXT());
    }

    public VulkanDebugReportCallbackCreateInfoEXT(VkDebugReportCallbackCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportCallbackCreateInfoEXT getVk(){
        return (VkDebugReportCallbackCreateInfoEXT) super.getVk();
    }
    public VulkanDebugReportCallbackCreateInfoEXT(VulkanObject pNext, VulkanDebugReportFlagsEXT flags, PFNDebugReportCallbackEXT pfnCallback, VulkanObject pUserData) {
        super(new VkDebugReportCallbackCreateInfoEXT(pNext.getVk(), flags.getVk(), pfnCallback.getVk(), pUserData.getVk()));
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

    public VulkanDebugReportFlagsEXT getFlags() {
        return new VulkanDebugReportFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanDebugReportFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public PFNDebugReportCallbackEXT getPfnCallback() {
        return new PFNDebugReportCallbackEXT(getVk().getPfnCallback());
    }

    public void setPfnCallback(PFNDebugReportCallbackEXT pfnCallback) {
        getVk().setPfnCallback(pfnCallback.getVk());
    }

    public VulkanObject getPUserData() {
        return new VulkanObject(getVk().getPUserData());
    }

    public void setPUserData(VulkanObject pUserData) {
        getVk().setPUserData(pUserData.getVk());
    }


    public static class Array extends VulkanDebugReportCallbackCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportCallbackCreateInfoEXT> {
        public Array(VkDebugReportCallbackCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugReportCallbackCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugReportCallbackCreateInfoEXT o){
            this(new VkDebugReportCallbackCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugReportCallbackCreateInfoEXT.Array getVk(){
            return (VkDebugReportCallbackCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugReportCallbackCreateInfoEXT get(int i){
            return new VulkanDebugReportCallbackCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugReportCallbackCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugReportCallbackCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugReportCallbackCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugReportCallbackCreateInfoEXT.Pointer getVk(){
            return (VkDebugReportCallbackCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugReportCallbackCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportCallbackCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugReportCallbackCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugReportCallbackCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugReportCallbackCreateInfoEXT.Pointer.Array getVk(){
                return (VkDebugReportCallbackCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugReportCallbackCreateInfoEXT.Pointer get(int i){
                return new VulkanDebugReportCallbackCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
