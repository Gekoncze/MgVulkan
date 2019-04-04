package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentSampleLocationsEXT.html">khronos documentation</a>
 **/
public class VulkanAttachmentSampleLocationsEXT extends VulkanObject {
    public VulkanAttachmentSampleLocationsEXT(){
        super(new VkAttachmentSampleLocationsEXT());
    }

    public VulkanAttachmentSampleLocationsEXT(VkAttachmentSampleLocationsEXT vk){
        super(vk);
    }

    @Override
    public VkAttachmentSampleLocationsEXT getVk(){
        return (VkAttachmentSampleLocationsEXT) super.getVk();
    }

    public VulkanAttachmentSampleLocationsEXT(VulkanUInt32 attachmentIndex, VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        super(new VkAttachmentSampleLocationsEXT(attachmentIndex.getVk(), sampleLocationsInfo.getVk()));
    }

    public VulkanUInt32 getAttachmentIndex() {
        return new VulkanUInt32(getVk().getAttachmentIndex());
    }

    public void setAttachmentIndex(VulkanUInt32 attachmentIndex) {
        getVk().setAttachmentIndex(attachmentIndex.getVk());
    }

    public VulkanSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VulkanSampleLocationsInfoEXT(getVk().getSampleLocationsInfo());
    }

    public void setSampleLocationsInfo(VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        getVk().setSampleLocationsInfo(sampleLocationsInfo.getVk());
    }


    public static class Array extends VulkanAttachmentSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentSampleLocationsEXT> {
        public Array(VkAttachmentSampleLocationsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentSampleLocationsEXT.Array(count));
        }

        public Array(int count, VulkanAttachmentSampleLocationsEXT o){
            this(new VkAttachmentSampleLocationsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentSampleLocationsEXT.Array getVk(){
            return (VkAttachmentSampleLocationsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentSampleLocationsEXT get(int i){
            return new VulkanAttachmentSampleLocationsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentSampleLocationsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentSampleLocationsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentSampleLocationsEXT.Pointer(value));
        }

        @Override
        public VkAttachmentSampleLocationsEXT.Pointer getVk(){
            return (VkAttachmentSampleLocationsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentSampleLocationsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentSampleLocationsEXT.Pointer> {
            public Array(int count) {
                super(new VkAttachmentSampleLocationsEXT.Pointer.Array(count));
            }

            public Array(VulkanAttachmentSampleLocationsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentSampleLocationsEXT.Pointer.Array getVk(){
                return (VkAttachmentSampleLocationsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentSampleLocationsEXT.Pointer get(int i){
                return new VulkanAttachmentSampleLocationsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
