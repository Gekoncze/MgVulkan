package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsLabelEXT extends VulkanObject {
    public VulkanDebugUtilsLabelEXT(){
        super(new VkDebugUtilsLabelEXT());
    }

    public VulkanDebugUtilsLabelEXT(VkDebugUtilsLabelEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsLabelEXT getVk(){
        return (VkDebugUtilsLabelEXT) super.getVk();
    }

    public VulkanDebugUtilsLabelEXT(VulkanStructureType sType, VulkanObject pNext, VulkanChar pLabelName, VulkanFloat color) {
        super(new VkDebugUtilsLabelEXT(sType.getVk(), pNext.getVk(), pLabelName.getVk(), color.getVk()));
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

    public VulkanChar getPLabelName() {
        return new VulkanChar(getVk().getPLabelName());
    }

    public void setPLabelName(VulkanChar pLabelName) {
        getVk().setPLabelName(pLabelName.getVk());
    }

    public VulkanFloat getColor() {
        return new VulkanFloat(getVk().getColor());
    }

    public void setColor(VulkanFloat color) {
        getVk().setColor(color.getVk());
    }


    public static class Array extends VulkanDebugUtilsLabelEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsLabelEXT> {
        public Array(VkDebugUtilsLabelEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsLabelEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsLabelEXT o){
            this(new VkDebugUtilsLabelEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsLabelEXT.Array getVk(){
            return (VkDebugUtilsLabelEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsLabelEXT get(int i){
            return new VulkanDebugUtilsLabelEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsLabelEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsLabelEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsLabelEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsLabelEXT.Pointer getVk(){
            return (VkDebugUtilsLabelEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsLabelEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsLabelEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsLabelEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsLabelEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsLabelEXT.Pointer.Array getVk(){
                return (VkDebugUtilsLabelEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsLabelEXT.Pointer get(int i){
                return new VulkanDebugUtilsLabelEXT.Pointer(getVk().get(i));
            }
        }
    }
}
