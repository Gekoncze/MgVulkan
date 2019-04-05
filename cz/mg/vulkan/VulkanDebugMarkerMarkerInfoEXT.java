package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugMarkerMarkerInfoEXT extends VulkanObject {
    public VulkanDebugMarkerMarkerInfoEXT(){
        super(new VkDebugMarkerMarkerInfoEXT());
    }

    public VulkanDebugMarkerMarkerInfoEXT(VkDebugMarkerMarkerInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugMarkerMarkerInfoEXT getVk(){
        return (VkDebugMarkerMarkerInfoEXT) super.getVk();
    }
    public VulkanDebugMarkerMarkerInfoEXT(VulkanObject pNext, VulkanChar pMarkerName, VulkanFloat color) {
        super(new VkDebugMarkerMarkerInfoEXT(pNext.getVk(), pMarkerName.getVk(), color.getVk()));
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

    public VulkanChar getPMarkerName() {
        return new VulkanChar(getVk().getPMarkerName());
    }

    public void setPMarkerName(VulkanChar pMarkerName) {
        getVk().setPMarkerName(pMarkerName.getVk());
    }

    public VulkanFloat getColor() {
        return new VulkanFloat(getVk().getColor());
    }

    public void setColor(VulkanFloat color) {
        getVk().setColor(color.getVk());
    }


    public static class Array extends VulkanDebugMarkerMarkerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerMarkerInfoEXT> {
        public Array(VkDebugMarkerMarkerInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugMarkerMarkerInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugMarkerMarkerInfoEXT o){
            this(new VkDebugMarkerMarkerInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugMarkerMarkerInfoEXT.Array getVk(){
            return (VkDebugMarkerMarkerInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugMarkerMarkerInfoEXT get(int i){
            return new VulkanDebugMarkerMarkerInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugMarkerMarkerInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugMarkerMarkerInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugMarkerMarkerInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugMarkerMarkerInfoEXT.Pointer getVk(){
            return (VkDebugMarkerMarkerInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugMarkerMarkerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerMarkerInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugMarkerMarkerInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugMarkerMarkerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugMarkerMarkerInfoEXT.Pointer.Array getVk(){
                return (VkDebugMarkerMarkerInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugMarkerMarkerInfoEXT.Pointer get(int i){
                return new VulkanDebugMarkerMarkerInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
